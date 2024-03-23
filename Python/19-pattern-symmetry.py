def symmetry(n):
    for i in range(n):
        print("* " * (n - i), end="")
        print("  " * (2 * (i + 1)), end="")
        print("* " * (n - i))

    for i in range(n):
        print("* " * (i + 1), end="")
        print("  " * (2 * n), end="")
        print("* " * (i + 1))

n = int(input())
symmetry(n)
