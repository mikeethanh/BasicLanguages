using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp5_cac_phep_toan_so_hoc
{ 
    class toantugan
    {
        static void Main()
        {
            Console.Title = "mikeethanh";
            // AsignOperators : toan tu gan 
            // = += -= *= %= /= 
            // defaul 
            int c = default;           
            int b = c ;
            Console.WriteLine(c);
            string d = default; 
            Console.WriteLine(d);
            bool bo = default;
            Console.WriteLine(bo);
            int a = 100;
            a += b; // a = a + b 
        }
        
    }
}
