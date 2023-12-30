public class insertionSort implements sort{
    
    @Override
    public void ascending(double arr[]) {
            //xet tu index x= 1
    int n = arr.length;
    for (int i = 0 ; i < n ; i++) {
        //khai bao x = phan tu dang xet de arre sau co the chen 
        //lay ra arri tri cua phan tu dung truoc no 
        double x = arr[i];
        int pos = i-1;
        //xet arrong lap while de dich phai arra tim arri tri nho hon x 
        while(pos >= 0 && x < arr[pos]) {
            arr[pos+1] = arr[pos];
            pos--; 
        }
        arr[pos+1] = x;
    }
    }

    @Override
    public void descending(double arr[]) {
                   //xet tu index x= 1
    int n = arr.length;
    for (int i = 0 ; i < n ; i++) {
        //khai bao x = phan tu dang xet de arre sau co the chen 
        //lay ra arri tri cua phan tu dung truoc no 
        double x = arr[i];
        int pos = i-1;
        //xet arrong lap while de dich phai arra tim arri tri nho hon x 
        while(pos >= 0 && x > arr[pos]) {
            arr[pos+1] = arr[pos];
            pos--; 
        }
        arr[pos+1] = x;
    }
    }
}
