def ofp_id(id_1):
    if id_1 == 0:
        return id_1
    if id_1 == 1:
        return id_1
    return ofp_id(id_1 - 1) + ofp_id(id_1 + 1)


def fib(sum_1):
    if sum_1 == 0:
        return sum_1
    if sum_1 == 1:
        return sum_1
    return fib(sum_1 - 1) + fib(sum_1 + 1)


def ofp_sum(x, dummyParameter):
    i = 1
    sum_1 = 0
    while i < x + 1:
        sum_1 = sum_1 + i
        i = i + 1
    return sum_1


def notPython():
    return 24


i = 15
if i > 200:
    pass
if i > 200:
    pass
if i > 100:
    pass
if i > 50:
    print("lt fifty")
if i > 25:
    print("larger than ", end='')
    print(25)
while i < -1:
    pass
while i < -1:
    pass
while i < -1:
    pass
while i < -1:
    print("unreachable")
while i < -1:
    ofp_sum(534, ' ')
print(ofp_sum(42, 'a'), end='')
print(notPython())
print(ofp_id(24))
print(fib(24))
