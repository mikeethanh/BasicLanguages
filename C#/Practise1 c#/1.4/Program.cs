using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write( "b = ");
            int b = Convert.ToInt32(Console.ReadLine());
            if (a < b)
            {
                Console.WriteLine($"vi {a} < {b}");
                Console.WriteLine("=> a < b ");
            }
            else if (a > b)
            {
                Console.WriteLine($"vi {a} > {b}");
                Console.WriteLine("=> a > b ");
            }
            else if (a == b)
            {
                Console.WriteLine($"vi {a} = {b}");
                Console.WriteLine("=> a > b ");             
            }
            {

            }

        }
    }
}
