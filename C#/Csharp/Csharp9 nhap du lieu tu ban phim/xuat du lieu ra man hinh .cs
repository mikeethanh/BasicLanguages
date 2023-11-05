using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp9_nhap_du_lieu_tu_ban_phim
{
    internal class xuat_du_lieu_ra_man_hinh
    {
        static void Main()
        {
            // Luon de ReadLine , muon xuong dong chi duoc de write -> ReadLine 
            Console.Write("a=");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("b=");
            int b = Convert.ToInt32(Console.ReadLine());
            int sum = a + b;         
            // c1 : 
            Console.WriteLine("C1 :tong a + b =" + sum);
            // c2 : (imprtant ) 
            Console.WriteLine("C2 :tong {0} + {1} ={2}", a, b, sum);
            //c3 :
            Console.WriteLine($"C3 : tong {a}+{b}= {sum}");
        }
           
    }
}
