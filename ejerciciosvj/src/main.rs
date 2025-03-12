use::std::io;
fn mi_funcion(mut lista: Vec<i32>){
    let mut contador_2 = lista.len();
    let mut indice = 0;
    let mut indice_2 = contador_2-1;
    let mut intentos = 0;
    for i in 0..lista.len()-1{
        if lista[i] == lista[indice] || lista[i]<lista[indice] {
            indice = i;
        }
       else if lista[contador_2-1] == lista[indice_2] || lista[contador_2-1]>lista[indice_2]{
            indice_2 = contador_2-1;
        }
        contador_2 = contador_2-1;
    }
    contador_2 = lista.len();
    println!("{}: {}",indice, lista[indice]);
    println!("{}: {}",indice_2, lista[indice_2]);
    for i in 0..lista.len(){
        let mut temp = 0;
        if lista[indice]<lista[i] && lista[i]==lista[indice_2]{
            temp = lista[i];
            lista[i]=lista[indice];
            lista[indice] = temp;
            println!("si, {} - {}",i,indice);
            indice = indice+1;
            indice_2 = indice_2-1;
            intentos = intentos+1;
        }
        else if lista[indice]<lista[i]{
            temp = lista[i];
            lista[i]=lista[indice];
            lista[indice] = temp;
            intentos = intentos+1;
            indice = indice+1;
        }
        if lista[indice_2]>lista[contador_2-1]{
            temp=lista[contador_2-1];
            lista[contador_2-1]=lista[indice_2];
            lista[indice_2]=temp;
            intentos = intentos+1;
            indice_2=indice_2-1;
        }
        contador_2=contador_2-1;
    }
    println!("{}",intentos);
    println!("{:?}",lista);
}
fn main() {
    let mut inpt = String::new();
    let msg = "No se leyó la linea";
    let mut lista:Vec<i32> = Vec::new();
    io::stdin().read_line(&mut inpt).expect(msg);
    let lista_2: Vec< &str> = inpt.split_whitespace().collect();
    // 10 10 58 31 63 40 76. 33 44 11 22
    for i in &lista_2{
        let elemento:i32 = i.parse().unwrap();
        lista.push(elemento);
    }
    mi_funcion(lista);
}
