using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp15_cau_truc_switch_case
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // cau truc switch case ( nhieu hon 2 TH phai dang gia) 
         
            /* switch ( expression )- string char 
                 {
                 case x :
                  // code block 
                   break;
                 case y : 
                   // code block 
                   break; 
                 default : 
                 // code block 
                 break; 
              */
            int dayOfWeek = Convert.ToInt32(Console.ReadLine());
            switch (dayOfWeek)
            {
                case 1:
                    Console.WriteLine("Today is : Monday ");
                    break; 
                case 2 :
                    Console.WriteLine("Today is : Tuesday ");
                    break;
                case 3:
                    Console.WriteLine("Today is : Wednesday ");
                    break ;
                default:                 
                        Console.WriteLine(" Nhap vao dung ngau trong tuan (1- 7)");                   
                    break; 



            }

            
        }
    }
}
