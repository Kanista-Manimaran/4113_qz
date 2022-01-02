L = [2, 2, 3, 3, 4, 5, 6, 7, 8, 10]

width = 0

def delete(w,L):
    if w in L:
        L.remove(w)

def calcD(y, X):
    arr = []

    for i in X:
        arr.append(abs(i - y))

    return arr

def partialDigest(L):
    global width
    width = max(L)
    delete(width,L)
    X = [0, width]
    place(L, X)


def place(L, X):
    if len(L) == 0:
        X.sort()
        print(X)
        return

    y = max(L)

    a1 = calcD(y, X)
    if set(a1).issubset(set(L)):
        X.append(y)
        for i in a1:
            delete(i,L)
        place(L, X)
        delete(y,X)
        for i in a1:
            L.append(i)

    absY = abs(width - y)
    a2 = calcD(absY, X)

    if set(a2).issubset(set(L)):
        X.append(absY)
        for i in a2:
            delete(i,L)
        place(L, X)
        delete(absY,X)
        for i in a2:
            L.append(i)


partialDigest(L)
