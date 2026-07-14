n, x = map(int, input().split())
arr = list(map(int, input().split()))

is_exist = False
for a in arr:
    if x == a:
        is_exist = True
        break

print('Yes' if is_exist else 'No')
