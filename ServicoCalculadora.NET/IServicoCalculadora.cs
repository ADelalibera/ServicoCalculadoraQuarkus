using System.ServiceModel;

namespace ServicoCalculadora
{
    [ServiceContract]
    public interface IServicoCalculadora
    {
        [OperationContract]
        long Soma(long x, long y);
    }
}