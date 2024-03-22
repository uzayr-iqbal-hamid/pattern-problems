def numberCrown(n):
    # Write your code here.
    for i in range(n):
        for j in range(i + 1):
            print(j + 1, end=" ")

        for j in range(n + 1):
            print(" ", end=" ")

        for j in range(i + 1, 0, -1):
            print(j, end=" ")

        print()

def main():
    n = int(input())
    numberCrown(n)

if __name__ == "__main__":
    main()
