using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp13_su_dung_xau_ki_tu
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // lop string 
            // Length : do dai string , ki tu 
            // ToUpper() : viet hoa het cac tu trong string 
            // ToLower() : viet thuong 
            // Trim(). ... : loai bo het dau cach o dau va o cuoi 
            // Contains("") : tim xem trong lop string có chua ki tu do hay khong 
            // IndexOf("")  : vi tri ki tu xuat hien dau   tien trong chuoi string 
            // LastIndexOf("") : vi tri ki tu xuat hien dau   tien trong chuoi string tu phai sang trai 
            string mgs = "        Hello World          ";
            Console.WriteLine(mgs.Length);
            Console.WriteLine(mgs.ToUpper());
            Console.WriteLine(mgs.ToLower());
            Console.WriteLine(mgs.Trim().ToLower());
            Console.WriteLine(mgs.Contains("o"));
            Console.WriteLine(mgs.IndexOf("o"));
            Console.WriteLine(mgs.LastIndexOf("o"));
            //mgs.
        }
    }
}
