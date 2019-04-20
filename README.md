# Barcode Generator EAN 13 & ISBN13
## EAN13
European Article Number 13. Cuyos dos primeros dígitos representan el país donde reside la empresa. 
Los dígitos que restan hasta el 12 están a disposición del propietario de la marca. El dígito de 
control, es el décimo tercer dígito en la secuencia y permite decidir si el código es válido o no.
Para los códigos EAN13 hay una ecuación matemática que cálcula el dígito de control: 
 > Latex:
    `C_{13} = -\sum_{j=1}^6 (C_{2j-1} - 3C_{2j}) mod 10`
## ISBN13
International Standard Book Number. Este sistema permite: identificar cada libro, como si fuera su cédula de identidad, al registrar el título, edición, editor, tiraje, extensión, materia, país, lengua original, etc. Sistematizar la producción editorial de cada país, al proveer los elementos que hacen posibles las estadísticas.Para estos códigos se prefijan con "978" (y el dígito de control será recalculado); cuando se agoten los ISBN "978", se introducirá el prefijo 979.
