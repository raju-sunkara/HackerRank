# Program prints alphabet rangoli pattern of size n
def print_rangoli(n):
    for i in range(n*2+1):
        for j in range(n*3+2):
            print("-", end="")
        print(end="\n")

if __name__ == "__main__":
    n = int(input("Enter the size of the rangoli: "))
    print_rangoli(n)