using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp21_lenh_break__continue
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // su dung lenh break . continue 
            int N = 100;
            for (int i = 1; i <= N; i++)
            {
                Console.WriteLine(i);
                if (i % 20 == 0)
                {
                    break;
                }
            }  
        }
    }
}
