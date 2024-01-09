//Generics trong Java là một tính năng cho phép bạn tạo các lớp, phương thức hoặc 
//interfaces mà có thể hoạt động với mọi kiểu dữ liệu (type) khác nhau được cung cấp 
//cho nó. Nó cung cấp linh hoạt và an toàn kiểu (type-safe) trong việc làm việc với kiểu dữ liệu

//su dung genneric (T : type)
//Đoạn mã public class Box<T> định nghĩa một lớp có tên là Box và là một lớp generic trong Java. 
//Trong đó, T là một tham số kiểu dữ liệu (type parameter) được sử dụng để tạo lớp generic.
public class box<T> {
    private T value;

    //constructor
    public box(T value) {
        this.value = value;
    };

    //getter , setter 
    public T getValue() {
        return value;
    }

    public voi setValue(T value) {
        this.value = value;
    }
}