using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp_11_gioi_thieu_lop_math
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("b=");
            int b = Convert.ToInt32(Console.ReadLine());    
            // su dung lop tinh toan so hoc : Math 
                      
            int max = Math.Max(a,b);
            int min = Math.Min(a,b);
            Console.WriteLine($"Max ({a} , {b}) = {max}");
            Console.WriteLine("Max ({0} , {1})= {2}",a,b,max);
            Console.WriteLine($"Min ({a} , {b})= {min}");

            // Abs : tri tuyet doi 
            Console.Write("x = ");
            float x = Convert.ToSingle(Console.ReadLine());
            float abs = Math.Abs(x);
            Console.WriteLine($"Abs ({x}) : {abs} ");


            // Sqrt: can bac hai cua 1 so 
            int y =(int) Math.Sqrt(500);
            Console.WriteLine("Can bac hai cua y : "+y); 
            /*d
             * d
             * d
             */



        }
    }
}
