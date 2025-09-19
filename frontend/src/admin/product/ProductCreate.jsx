import React, { useState } from 'react';
function ProductCreate() {
    const [product, setProduct] = useState({
        name: '',
        description: '',
        category:'',
        category: '',
        tag:'',
        stock: ''
    });
    const handleChange = (event) => {
        const { name, value } = event.target;
        setProduct(prevProduct => ({
            ...prevProduct,
            [name]: value
        }));
    };
    const handleSubmit = (event) => {
        event.preventDefault();
        console.log("Submitting Product:", product);
    };
    return (
        <div className="container mt-4">
            <h2>Create a Product</h2>
            <form onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label htmlFor="name" className="form-label">Product Name</label>
                    <input
                        type="text"
                        className="form-control"
                        id="name"
                        name="name"
                        value={product.name}
                        onChange={handleChange}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="description" className="form-label">Description</label>
                    <textarea
                        className="form-control"
                        id="description"
                        name="description"
                        rows="3"
                        value={product.description}
                        onChange={handleChange}
                    ></textarea>
                </div>
                <div className="mb-3">
                    <label htmlFor="category" className="form-label">category</label>
                    <input
                        type="text"
                        className="form-control"
                        id="category"
                        name="category"
                        value={product.category}
                        onChange={handleChange}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="price" className="form-label">Price</label>
                    <input
                        type="number"
                        className="form-control"
                        id="price"
                        name="price"
                        value={product.price}
                        onChange={handleChange}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="tag" className="form-label">Tag</label>
                    <textarea
                        className="form-control"
                        id="tag"
                        name="tag"
                        rows="3"
                        value={product.tag}
                        onChange={handleChange}
                    ></textarea>
                </div>
                <div className="mb-3">
                    <label htmlFor="stock" className="form-label">Stock Quantity</label>
                    <input
                        type="number"
                        className="form-control"
                        id="stock"
                        name="stock"
                        value={product.stock}
                        onChange={handleChange}
                    />
                </div>
                <button type="submit" className="btn btn-primary">Create Product</button>
            </form>
        </div>
    );
}

export default ProductCreate;