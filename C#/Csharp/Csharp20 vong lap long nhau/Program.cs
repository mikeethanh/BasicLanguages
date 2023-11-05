using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp20_vong_lap_long_nhau
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // for , while , do-while 
            for (int i = 0; i < 10; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    Console.WriteLine($"{i} x {j} = {i*j}");
                }
                Console.WriteLine();
                // ket thuc 1 vong lap tu xuong dong 
            }
            // su dung vong lap while 
            int a = 0;            
            while (a <= 10 )
            {                  
                int b = 1;
                while (b <= 10)
                {
                    Console.WriteLine($"{a} x {b} = {a * b }");
                    b++;
                    
                }
                Console.WriteLine();
                a++;
            }

        }
    }
}
