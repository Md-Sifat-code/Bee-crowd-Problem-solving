import sys
import math

def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def main():
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    results = []
    for i in range(1, N + 1):
        X = int(data[i])
        if is_prime(X):
            results.append("Prime")
        else:
            results.append("Not Prime")
    for result in results:
        print(result)

if __name__ == "__main__":
    main()
