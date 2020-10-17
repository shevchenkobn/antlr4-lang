def ofp_id(id_1):
    if id_1 == 0:
        return id_1
    if id_1 == 1:
        return id_1
    if False:
        id_2 = 42
        while False:
            id_3 = 'a'
            print(id_3)
            del id_3
        del id_2
    return ofp_id(id_1 - 1) + ofp_id(id_1 - 2)


def fib(sum_1):
    if sum_1 == 0:
        return sum_1
    if sum_1 == 1:
        return sum_1
    if False:
        sum_2 = 42.0
        while False:
            fib_1 = 'a'
            sum_3 = 'a'
            id_1 = 0
            print(id_1)
            del sum_3, id_1, fib_1
        del sum_2
    return fib(sum_1 - 1) + fib(sum_1 - 2)


def noop(i, ofp_str, fasdfasdfasdfasfdasdfdsf, arr):
    pass


def ofp_sum(x, dummyParameter):
    i = 1
    sum_1 = 0
    while i < x + 1:
        sum_1 = sum_1 + i
        i = i + 1
    return sum_1


def notPython():
    return 24


def arrays():
    ia = [0] * 42
    ca = ['a', 'b', 'c']
    fa = [0.0, 2.2, 42.0]
    fa = [0.0] * ia[0]
    ca = [' '] * 4
    ia = [len(ca), len(fa), ia[3], 4 + 8, -16]
    ia[3] = 3453
    ca[1] = 'D'
    return ca


def notCeilDiv(a, b):
    c = a / b
    return (-a + -(a / b * a)) / b + b - a


def ceilDiv(a, b):
    c = a // b
    return -(-(a + (a - 1)) // b)


i = 15
if i > 200:
    pass
else:
    if i > 200:
        pass
if i > 100:
    pass
else:
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
noop(43, "kekeke", 4.3453345345, [])
i = 0
c = 'a'
f = 0.4
while i < 10:
    if c == 'b':
        print(i, end='')
        print(c, end='')
        print(f, end='')
    if i // 2 == i // 3:
        i_2 = 0
        f_2 = 'b'
        c_2 = 3.5
        while i_2 > -10:
            if f_2 == 'c':
                print(i_2, end='')
                print(c_2, end='')
                print(f_2, end='')
            else:
                f_3 = 3
                c_3 = 2
                if f_3 == 4:
                    i_3 = 'd'
                    c_4 = "asdf"
                    if i_3 == 'e':
                        print(i_3, end='')
                        print(c_4)
                    del c_4, i_3
                else:
                    f_4 = "asdf"
                    if c_3 == 4:
                        print(f_4)
                    del f_4
                del c_3, f_3
            i_2 = i_2 - 1
        if f_2 == 'c':
            i_3 = 'd'
            c_3 = "asdf"
            if i_3 == 'e':
                i_4 = 4.3
                print(i_4, end='')
                print(c_3)
                del i_4
            del c_3, i_3
        del c_2, f_2, i_2
    i = i + 1
arrays()
ofp_str = "hehehehe"
print(len(ofp_str))
print(-ceilDiv(4, 3) * -345 - -43 - 3)
print(notCeilDiv(4.0, 3.0) * 3.45)
