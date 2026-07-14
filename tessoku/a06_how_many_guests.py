# 累積和
lr = []

n, q = map(int, input().split())
arr = list(map(int, input().split()))
for i in range(0, q):
    l, r = map(int, input().split())
    tmp = []
    tmp.append(l)
    tmp.append(r)
    lr.append(tmp)

ps = [0]
for i in range(1, n + 1):
    ps.append(ps[i - 1] + arr[i - 1])

for i in range(0, q):
    l = lr[i][0]
    r = lr[i][1]
    print(ps[r] - ps[l - 1])
