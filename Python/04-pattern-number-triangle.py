def nTriangle(n):
    for i in range(1, n+1):
        for j in range(1, i+1):
            print(i, end=" ")
        print()

def main():
    n = int(input())
    nTriangle(n)

if __name__ == "__main__":
    main()
