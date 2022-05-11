import { ReactComponent as Arrow } from 'assets/img/Arrow.svg';
import './styles.css';

function Pagination() {
  return (
    <div className="djmovie-pagination-container">
      <div className="djmovie-pagination-box">
        <button className="djmovie-pagination-button" disabled={true}>
          <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="djmovie-pagination-button" disabled={false}>
          <Arrow className="djmovie-flip-horizontal" />
        </button>
      </div>
    </div>
  )
}

export default Pagination
