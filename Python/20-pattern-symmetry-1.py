def symmetry(n):
    for i in range(n):
        # stars
        print("* " * (i + 1), end="")
        # spaces
        print(" " * (n - i - 1), end="")
        # stars
        print("* " * (i + 1))

    for i in range(n - 1):
        # stars
        print("* " * (n - i - 1), end="")
        # spaces
        print(" " * (i + 1), end="")
        # stars
        print("* " * (n - i - 1))

n = int(input())
symmetry(n)
