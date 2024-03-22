def nNumberTriangle(n):
    # Write your code here
    num = 1
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            print(num, end=" ")
            num += 1
        print()

def main():
    n = int(input())
    nNumberTriangle(n)

if __name__ == "__main__":
    main()
