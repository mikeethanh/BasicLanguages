using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practise_2_vong_lap_don
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // nhap so tu nhien n sau do in ra cac so chan le <= n
            Console.Write(" Nhap n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i <=  n; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine(i);
                }
            }

        }
    }
}
