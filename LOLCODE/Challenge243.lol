HAI 1.4
  OBTW
    This was made by ANDREW BUDZISZEK on 12/3/15
  TLDR

  VISIBLE ":)--------------------------------------- :)Reddit Daily Programmer: Challenge #243 :)--------------------------------------- :)"
  I HAS A CurrentNum ITZ A NUMBR

  IM IN YR loop1
    VISIBLE "Enter a number(-1 to quit): "
    GIMMEH CurrentNum, CurrentNum IS NOW A NUMBR
    BOTH SAEM CurrentNum AN -1, O RLY?
      YA RLY, GTFO
    OIC
    I HAS A divisorTot ITZ 0
    IM IN YR loop UPPIN YR i TIL BOTH SAEM i AN SUM OF CurrentNum AN 1
      i, O RLY?
        YA RLY
          I HAS A temp ITZ MOD OF CurrentNum AN i
          BOTH SAEM temp AN 0, O RLY?
          YA RLY, divisorTot R SUM OF divisorTot AN i
        OIC
      OIC
    IM OUTTA YR loop
    DIFFRINT divisorTot AN BIGGR OF divisorTot AN PRODUKT OF 2 AN CurrentNum, O RLY?
      YA RLY, VISIBLE CurrentNum " is deficient."
      NO WAI, VISIBLE CurrentNum " is abundant by " DIFF OF divisorTot AN PRODUKT OF 2 AN CurrentNum
    OIC
  IM OUTTA YR loop1

  VISIBLE "KTHXBYE!"

KTHXBYE
