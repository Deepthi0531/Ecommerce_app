import React, { useState } from 'react';

function ProductList() {
    const [products, setProducts] = useState([
        { id: 'a01', name: 'Samsung galaxy s25 ultra', description: 'Super mobile phone', category: 'electronics', price: 125000.98, tag: 'nil', stock: 500 },
        { id: 'a02', name: 'IQOO', description: 'nice mobile', category: 'electronics', price: 13000, tag: 'nil', stock: 50 }
    ]);

    return (
        <>
            <h3>Product List</h3>
            <div className="container">
                <table className="table table-stripped">
                    <thead>
                        <tr>
                            <th scope="col">id</th>
                            <th scope="col">name</th>
                            <th scope="col">description</th>
                            <th scope="col">category</th>
                            <th scope="col">price</th>
                            <th scope="col">tag</th>
                            <th scope="col">stock</th>
                        </tr>
                    </thead>
                    <tbody>
                        {products.map((product) => (
                            <tr key={product.id}>
                                <th scope="row">{product.id}</th>
                                <td>{product.name}</td>
                                <td>{product.description}</td>
                                <td>{product.category}</td>
                                <td>₹{product.price}</td>
                                <td>{product.tag}</td>
                                <td>{product.stock}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

export default ProductList;