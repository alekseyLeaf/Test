   i   m   p   o   r   t       j   a   v   a   .   u   t   i   l   .   O   b   j   e   c   t   s   ;      
      
   p   u   b   l   i   c       c   l   a   s   s       T   e   s   t       {      
                   p   r   i   v   a   t   e       i   n   t       a   ;      
                   p   r   i   v   a   t   e       i   n   t       b   ;      
      
                   p   u   b   l   i   c       i   n   t       g   e   t   A   (   )       {      
                                   r   e   t   u   r   n       a   ;      
                   }      
      
                   p   u   b   l   i   c       v   o   i   d       s   e   t   A   (   i   n   t       a   )       {      
                                   t   h   i   s   .   a       =       a   ;      
                   }      
      
                   p   u   b   l   i   c       i   n   t       g   e   t   B   (   )       {      
                                   r   e   t   u   r   n       b   ;      
                   }      
      
                   p   u   b   l   i   c       v   o   i   d       s   e   t   B   (   i   n   t       b   )       {      
                                   t   h   i   s   .   b       =       b   ;      
                   }      
      
                   @   O   v   e   r   r   i   d   e      
                   p   u   b   l   i   c       b   o   o   l   e   a   n       e   q   u   a   l   s   (   O   b   j   e   c   t       o   )       {      
                                   i   f       (   t   h   i   s       =   =       o   )       r   e   t   u   r   n       t   r   u   e   ;      
                                   i   f       (   o       =   =       n   u   l   l       |   |       g   e   t   C   l   a   s   s   (   )       !   =       o   .   g   e   t   C   l   a   s   s   (   )   )       r   e   t   u   r   n       f   a   l   s   e   ;      
                                   T   e   s   t       t   e   s   t       =       (   T   e   s   t   )       o   ;      
                                   r   e   t   u   r   n       a       =   =       t   e   s   t   .   a       &   &       b       =   =       t   e   s   t   .   b   ;      
                   }      
      
                   @   O   v   e   r   r   i   d   e      
                   p   u   b   l   i   c       i   n   t       h   a   s   h   C   o   d   e   (   )       {      
                                   r   e   t   u   r   n       O   b   j   e   c   t   s   .   h   a   s   h   (   a   ,       b   )   ;      
                   }      
      
                   @   O   v   e   r   r   i   d   e      
                   p   u   b   l   i   c       S   t   r   i   n   g       t   o   S   t   r   i   n   g   (   )       {      
                                   r   e   t   u   r   n       "   T   e   s   t   {   "       +      
                                                                   "   a   =   "       +       a       +      
                                                                   "   ,       b   =   "       +       b       +      
                                                                   '   }   '   ;      
                   }      
   }      
