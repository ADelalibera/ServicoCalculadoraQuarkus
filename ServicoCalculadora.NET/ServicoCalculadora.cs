using System;
using System.ServiceModel;

namespace ServicoCalculadora
{
    [ServiceBehavior(InstanceContextMode = InstanceContextMode.PerSession, ConcurrencyMode =ConcurrencyMode.Multiple, Name = "ServicoCalculadora", AddressFilterMode = AddressFilterMode.Any)]
    public class ServicoCalculadora : IServicoCalculadora
    {
        public long Soma(long x, long y)
        {
            long r = x + y;
            Console.WriteLine($"Soma({x}+{y})={r}");
            return r;
        }

    }
}
