public class Main {
    public static void main(String[] args) {
        // สร้าง object จาก Class Car
        Car car = new Car();
        
        // ใช้ setter เพื่อกำหนดค่า brand และ speed
        car.setBrand("Toyota");
        car.setSpeed(120);
        
        // เรียกใช้ displayInfo()
        car.displayInfo();
    }
}

// คลาส Car ไม่ใช่ public (ไม่ใส่คำว่า public)
class Car {
    // Properties แบบ private
    private String brand;
    private int speed;
    
    // Setter methods
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    
    // Getter methods
    public String getBrand() {
        return brand;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    // Method แสดงข้อมูล
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}