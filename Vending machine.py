class VendingMachine:
    def __init__(self):
        self.bottles = 20
        
    def purchase(self, amount):
        self.bottles = self.bottles - amount
      
    def restock(self, amount):
        self.bottles = self.bottles + amount
    
    def get_inventory(self):
        return self.bottles
        
    def report(self):
        print(f'Inventory: {self.bottles} bottles')

if __name__ == "__main__":

    amount_purchase = int(input())
    amount_restock = int(input())
    v1 = VendingMachine()
    v1.purchase(amount_purchase)
    v1.restock(amount_restock)
    v1.get_inventory()
    v1.report()