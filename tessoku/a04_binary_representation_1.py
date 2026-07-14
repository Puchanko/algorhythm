from collections import deque

n = int(input())

def to_binary(n):
    l = deque()
    d = n
    while d > 0:
        m = d % 2
        l.appendleft(m)
        d //= 2
    while len(l) < 10:
        l.appendleft(0)
    return l;

print(*to_binary(n), sep='')
