
def get_name(prefix, suffix):
    long_name = f"{prefix}_{suffix}"
    return long_name

class ECar :
    def __init__(self, make, model, year, km):
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0
        self.km = km

    def show_battry(self, new_km: str = 'new'):
        if new_km == 'new':
            return self.km
        else:
            self.km = self.km * 10
        return self.km


my_ecar = ECar("make", "model", "year", 100)
result = my_ecar.show_battry(100)
print(result)

