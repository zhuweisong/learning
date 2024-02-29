
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

    def show_battry(self):
        return self.km

