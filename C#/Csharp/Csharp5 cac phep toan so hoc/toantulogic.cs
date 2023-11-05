using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp5_cac_phep_toan_so_hoc
{
    internal class toantulogic
    {
        static void Main()
        {
            // || : hoac && : va ! : phu dinh 

            // || 1 or 2 tm bool => true 
            int a = 9, b = 10, c = 11;
            bool hoac1 = (a % 3 == 0) || (b % 3 == 0);
            Console.WriteLine(hoac1);
            bool hoac2 = (a % 2 == 0) || (b % 4 == 0);
            Console.WriteLine(hoac2);
             
            // && ca 2 tm bool => true 
            bool va1 = (a % 3 == 0 ) && (b % 2 == 0);
            Console.WriteLine(va1);
            bool va2 = (a % 3 == 0 ) && (b % 3 == 0);
            Console.WriteLine(va2);
            bool va3 = (a % 3 == 0 ) && (b % 3 == 1);
            Console.WriteLine(va3);
            // ! : phu dinh ;  note : vi tri
            bool pd1 = (a % 2 == 0);
            Console.WriteLine(! pd1);
        }
    }
}
