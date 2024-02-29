# 导入模块
# *toppings中的星号让Python创建一个名为toppings的空元组，并将收到的所有值都封装到这个元组中

def get_pie(name="pepperoni"):
    """获取要制作的派"""
    print(f"get {name} pie success!")


def make_pie(size, *toppings):
    """概述要制作的派"""
    print(f"\nMaking a {size} pie with the following toppings:")
    for topping in toppings:
        print(f"- {topping}")

    return "success!"