const frutas = [
    {title: 'Banana', Fruta: false, id: 1},
    {title: 'Laranja', Fruta: false, id: 2},
    {title: 'Maçã', Fruta: true, id: 3},
];

export default function Lista_Frutas() {
    const Lista = frutas.map(product =>
        <li
        key={product.id}
        style={{color: product.Fruta ? 'magenta' : 'darkgreen' }}>
            {product.title}
        </li>
    );
    return (
        <ul>{Lista}</ul>
    );
}