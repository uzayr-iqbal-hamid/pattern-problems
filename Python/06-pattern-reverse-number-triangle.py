def nNumberTriangle(n):
    for i in range(n):
        for j in range(1, n-i+1):
            print(j, end=" ")
        print()

def main():
    n = int(input())
    nNumberTriangle(n)

if __name__ == "__main__":
    main()
