class Car:
    def __init__(self, model_year = 0,purchase_price = 0, current_value = 0 ):
        self.year = model_year
        
        self.price = purchase_price
        self.current_value = current_value

    def calc_current_value(self, current_year):
        depreciation_rate = 0.15
       
        car_age = current_year - self.model_year
        self.current_value = round(self.purchase_price * (1 - depreciation_rate) ** car_age)
    
    
    def print_info(self):
        print("Car's information:")
        print('   Model year:' , self.model_year)
        print('   Purchase price:' , self.purchase_price)
        print('   Current value:' , self.current_value)


if __name__ == "__main__":    
    year = int(input()) 
    price = int(input())
    current_year = int(input())
    
    my_car = Car()
    my_car.model_year = year
    my_car.purchase_price = price
    my_car.calc_current_value(current_year)
    my_car.print_info()