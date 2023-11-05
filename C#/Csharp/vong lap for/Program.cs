using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace vong_lap_for
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // for loop
            // hien thi ra cac so le <= a 
            // for ( khoi tao , dieu kien , buoc nhay ) 
             Console.Write("nhap a :");
            int a = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i <= a; i++) 
            {
                if (i % 2 == 1)
                {
                    Console.WriteLine("cac so le <= a : "+i);
                }
            }
            //tong cac gia tri tu m -> n \
            Console.Write("Nhap m : ");
            double m = Convert.ToDouble(Console.ReadLine());
            Console.Write("Nhap n : ");
            double n = Convert.ToDouble(Console.ReadLine());
            double sum = default(double);
            for (double i = m; i <= n; i++)
            {
                // cu sau moi vong lap thi sum = sum +i
                sum += i;
                
            }// note 
            Console.WriteLine($"tong tu {m} den {n} la : {sum}");
            // neu de bai cho tong cac so le tu m-> n : cho buoc nhay : i += 2 
        }
    }
}
