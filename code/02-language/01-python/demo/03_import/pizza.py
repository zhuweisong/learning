# 导入模块
# *toppings中的星号让Python创建一个名为toppings的空元组，并将收到的所有值都封装到这个元组中
def make_pizza(size, *toppings):
    """概述要制作的披萨"""
    print(f"\nMaking a {size} pizza with the following toppings:")
    for topping in toppings:
        print(f"- {topping}")

    return "success!"

def get_pizza():
    return "get pizza success!"
