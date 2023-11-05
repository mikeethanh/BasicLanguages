using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp14_cau_truc_if_else
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // cau truc if - else
            

            /*
             * if(dieu kien) {
             *       do something 
             * } else { 
             *       do other thing 
             * }                
             */
            int dayOfWeek = 1;
            if (dayOfWeek <=5)
            {
                Console.WriteLine(" i have to go to school ");
            } else
            {
                Console.WriteLine(" i have to play girl ");
            }
            int money = 4500; 
            if ( money >4000)
            {
                Console.WriteLine("i can buy ip 12 pro max ");
            }
            else
            {
                Console.WriteLine("i can't buy ip12 ");


            }
            // cau truc if - else if 
            Console.Write("day =");
            int day = Convert.ToInt32(Console.ReadLine()) ; 
            if (day == 1)
            {
                Console.WriteLine("Today is : Monday ");

            }else if (day == 2)
            {
                Console.WriteLine("Today is : Tuesday ");
            }else if (day == 3)
            {
                Console.WriteLine("Today is : Wednesday ");
            }
             
        }
    }
}
