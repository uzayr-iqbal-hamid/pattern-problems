def seeding(n):
    for i in range(n):
        for j in range(n, i, -1):
            print("*", end=" ")
        print()

def main():
    n = int(input())
    seeding(n)

if __name__ == "__main__":
    main()
