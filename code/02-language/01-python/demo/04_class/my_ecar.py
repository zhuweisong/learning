# 说明：通过模块导入类
# 日期：2021/1/24
from car import ElectricCar, Car


# 实例化一个Car对象
my_car = Car('audi', 'a4', 2019)
print(my_car.get_descriptive_name())
my_car.read_odometer()

my_tesla = ElectricCar('tesla', 'model s', 2019)
print(my_tesla.get_descriptive_name())
my_tesla.battery.describe_battery()
