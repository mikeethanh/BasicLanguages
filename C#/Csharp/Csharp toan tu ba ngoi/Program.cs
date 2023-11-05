using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp_toan_tu_ba_ngoi
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // variable = (condition) ? expressionTrue : expressionFalse;\
            int time = 11; 
            string msg = default ;
            if (time < 12)
            {
                msg = "Hello";

            }else
            {
                msg = "Goodbye";
            }
            Console.WriteLine(msg);

            msg = (time < 12) ? "Hello" : "Goodbye";

        }
    }
}
