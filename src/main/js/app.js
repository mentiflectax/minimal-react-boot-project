'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

class TestPage extends React.Component {
    render() {
        return (
            <div>
                <p>This text was rendered in ReactJS.</p>
            </div>
        )
    }
}
ReactDOM.render(
    <TestPage />, document.getElementById('react')
)
