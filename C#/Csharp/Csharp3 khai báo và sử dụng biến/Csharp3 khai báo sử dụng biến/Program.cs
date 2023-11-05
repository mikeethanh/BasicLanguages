using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp3_khai_báo_sử_dụng_biến
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // type name = value; 
            string n = "Nguyen Mai Thanh ";
            Console.WriteLine("Name:"+( n ));
            string g = "male";
            Console.WriteLine("Sex(male/female):"+(g));
            string a = "18";
            Console.WriteLine("Age:"+(a));
            string E = "mikeethanh04gmail.com";
            string I = "mikeethanh";
            Console.WriteLine("Instagram"+(I));
            Console.WriteLine("Email:"+(E));
            string P = " 0865589695 ";
            Console.WriteLine("Phone number:"+(P));
            string s = "di phuot(nhung chua di bao gio), di chill";
            Console.WriteLine("Hobby:"+(s));
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("                       *** *** ");
            Console.WriteLine("Crush:Chu Linh xinh v~  *****");
            Console.WriteLine("                         *** ");
            Console.WriteLine("                          * ");
            Console.ForegroundColor = ConsoleColor.Gray;

            string d = "giau";
            Console.WriteLine("Dream:"+(d));
            int b = 20, c = 10;
            Console.WriteLine("b+c="+(b+c));
            double e = 99, f = 25;         
            Console.WriteLine("e+f="+(e+f));
            Console.WriteLine("e-f="+(e-f));
            Console.WriteLine("e*f="+(e*f));
            Console.WriteLine("e/b="+(e/b));
            double m = 76, l = 23;
            Console.WriteLine(m+l);
            


            




        }
    }
}
