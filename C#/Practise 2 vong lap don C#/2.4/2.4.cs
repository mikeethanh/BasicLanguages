using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._4
{
    internal class Class1
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap so tu nhien n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            if (n > 0)
            {
                int sum1 = default; 
                int sum2 = default;
                int sum3 = default;
                int sosohangle = default;
                int sosohangchan = default;
                for (int i = 1; i <=  n; i++)
                {
                    sum1 = sum1 + i;                   
                    if (i%2 == 1)
                    {
                        sum2 = sum2 + i;
                        sosohangle++;
                    }else
                    {
                        sum3 = sum3 + i;
                        sosohangchan++;
                    }                                                                          
                }
                Console.WriteLine("TBC so tu nhien <= n   " + ((sum1 * 1.0) / n));
                if (sosohangle > 0)
                {
                    Console.WriteLine("TBC so le <= n  :"+((sum2 *1.0) / sosohangle));
                }
                if (sosohangchan > 0)
                {
                    Console.WriteLine("TBC so chan <= n : " + ((sum3 * 1.0) / sosohangchan));
                }
            }
            else
            {
                Console.WriteLine("Nhap n > 0 ");
            }

        }
    }
}
