def solution(wallpaper: list) -> list:
    min_y = 50
    min_x = 50
    max_y = 0
    max_x = 0
    for y, dot in enumerate(wallpaper):
        for x, s in enumerate(dot):
            if s == '#':
                min_y = min(min_y,y)
                min_x = min(min_x,x)
                max_y = max(max_y,y)
                max_x = max(max_x,x)

    return [min_y,min_x,max_y+1,max_x+1]
