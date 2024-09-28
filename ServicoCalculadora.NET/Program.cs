using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.ServiceModel.Configuration;
using System.ServiceModel.Description;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ServicoCalculadora
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string hostname = "localhost:8000";
            
            if(args.Length > 0)
                hostname = args[0];

            Uri baseAddress = new Uri($"http://{hostname}/ServicoCalculadora");

            try
            {
                using (ServiceHost host = new ServiceHost(typeof(ServicoCalculadora), baseAddress))
                {
                    CustomBinding binding = new CustomBinding();
                    binding.Elements.Add(new TextMessageEncodingBindingElement());
                    binding.Elements.Add(new HttpTransportBindingElement());

                    //Expor metadados
                    ServiceMetadataBehavior serviceMetadataBehavior = new ServiceMetadataBehavior()
                    {
                        HttpGetEnabled = true,
                        
                    };
                    host.Description.Behaviors.Add(serviceMetadataBehavior);

                    //Adicionar o endpoint
                    host.AddServiceEndpoint(typeof(IServicoCalculadora), binding, "");

                    //Adicionar um endpoint de metadados MEX
                    //host.AddServiceEndpoint(ServiceMetadataBehavior.MexContractName, MetadataExchangeBindings.CreateMexHttpBinding(), "mex");

                    //Abrir o serviço
                    host.Open();

                    Console.WriteLine("--------------------------------------------------------------------------");
                    Console.WriteLine($"Service Running -> {baseAddress}");
                    Console.WriteLine("--------------------------------------------------------------------------");
                    Console.WriteLine("Pressione [ENTER] para encerrar o serviço");
                    Console.ReadLine();

                    host.Close();
                }
            }
            catch (CommunicationObjectFaultedException)
            {
                //Console.WriteLine(e.Message);
                Thread.Sleep(3000);
            }


        }
    }
}
