def nBinaryTriangle(n):
    # Write your code here.
    start = 1
    for i in range(n):
        if i % 2 == 0:
            start = 1
        else:
            start = 0
        for j in range(i + 1):
            print(start, end=" ")
            start = 1 - start
        print()

def main():
    n = int(input())
    nBinaryTriangle(n)

if __name__ == "__main__":
    main()
