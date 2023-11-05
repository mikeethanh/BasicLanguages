using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp9_nhap_du_lieu_tu_ban_phim
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // full name , age , avg mark      tu ban phim nhap vao command prompt 
            // WriteLine : nd xuat ra duoc xuong dong 
            // Write : nd xuat ra khong xuong dong 
            // Console.ReadLine : nhap du lieu du ban phim (string)
            Console.WriteLine("Hello mikeethanh ");
            int tenlop = 12;
            Console.Write("Hoc lop : " + tenlop);
            string tentruong = "xuandinhhighschool";
            Console.WriteLine(" Truong : " + tentruong);


            Console.Write("Nhap ho va ten : ");
            string fullname = Console.ReadLine();
            
            Console.Write("Nhap tuoi ");
            // chuyen tu string ->int 
            // c1 : int age = Convert.ToInt32(Console.ReadLine());
            // c2 : int age = System.Parse(Console.ReadLine());
            int age = Convert.ToInt32(Console.ReadLine());
           

            Console.Write( "Nhap diem trung binh lop 12 ");
            double diemtb = Convert.ToDouble (Console.ReadLine());
            Console.WriteLine("************************************");
            Console.WriteLine("Hello " + (fullname));
            Console.WriteLine("Do tuoi " + age);
            Console.WriteLine("Diem trung binh :" + diemtb);


        }
    }
}
