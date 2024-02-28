# Date: 2022/04/05

##---------- 简单的函数 ----------##
# 1. 定义函数，def开头，函数名，参数，冒号，缩进的代码块
# 2. 函数的参数, 可以有默认值,传递参数时, 可以使用位置参数, 也可以使用关键字参数
# 3. 函数的返回值, 不需要任何声明, 可以直接返回
# 4. 函数的注释, 可以使用三引号, 也可以使用#号
def greet_user(name, age=18):
    """显示简单的问候语""" # 这是一个函数注释
    message = f"Hello, {name.title()}, are you ready to learn some python today?"
    print(f"{name} Hello!")
    print(f"your age is {age}")
    return message

#通过关键字参数调用函数, output:
#Ada Hello!
#your age is 20
greet_user(name="Ada", age=20)

#通过位置参数调用函数, output:
#Bob Hello!
#your age is 18
greet_user("Bob")



##---------- 任意数量的实参 ----------##
# 1. 有时候，你预先不知道函数需要接受多少个实参，好在Python允许函数从调用语句中收集任意数量的实参
# 2. 例如，来看一个制作比萨的函数，它需要接受很多配料，但你无法预先确定顾客要多少种配料
# 3. 为此，你可以将函数编写成可以接受任意数量实参的函数
# 4. Python将实参封装到一个元组中，即便函数只收到一个值，也是如此
def build_pizza(size, *toppings):
    """概述要制作的披萨"""
    print(f"\nMaking a {size} pizza with the following toppings:")
    for topping in toppings:
        print(f"- {topping}")

build_pizza("large", 'pepperoni', "mushrooms", "green peppers", "extra cheese")

##---------- 任意数量的关键字实参 ----------##
# 1. 有时候，需要接受任意数量的实参，但预先不知道传递给函数的会是什么样的信息
# 2. 在这种情况下，可将函数编写成能够接受任意数量的键-值对——调用语句提供了多少就接受多少
# 3. 一个这样的示例是创建用户简介：你知道你将收到有关用户的信息，但不确定会是什么样的信息
# 4. 在这种情况下，可以将函数编写成只接受任意数量的键-值对——调用语句提供了多少就接受多少
def build_profile(first, last, **user_info):
    """创建一个字典，其中包含我们知道的有关用户的一切"""
    user_info['first_name'] = first
    user_info['last_name'] = last
    return user_info

user = build_profile(first='albert', last ='einstein', location='princeton', field='physics')
print(f"build_profile {user}")
#output: {'location': 'princeton', 'field': 'physics', 'first_name': 'albert', 'last_name': 'einstein'}
